package com.techelevator.reservations.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.techelevator.reservations.models.Hotel;
import com.techelevator.reservations.models.Reservation;

public class MemoryReservationDAO implements ReservationDAO {

    private List<Reservation> reservations;
    private HotelDAO hotelDAO;

    public MemoryReservationDAO(HotelDAO hotelDAO) {
        this.hotelDAO = hotelDAO;
        init();
    }

    private void init() {
        LocalDate now = LocalDate.now();
        List<Hotel> hotels = hotelDAO.list();
        reservations = new ArrayList<>();

        reservations.add(new Reservation(getMaxIdPlusOne(), hotels.get(0).getId(), "John Smith", now.toString(),
                now.plusDays(3).toString(), 2));
        reservations.add(new Reservation(getMaxIdPlusOne(), hotels.get(0).getId(), "Sam Turner", now.toString(),
                now.plusDays(5).toString(), 4));
        reservations.add(new Reservation(getMaxIdPlusOne(), hotels.get(0).getId(), "Mark Johnson",
                now.plusDays(7).toString(), now.plusDays(10).toString(), 2));
    }

    public List<Reservation> findAll() {
        return reservations;
    }

    @Override
    public List<Reservation> findByHotel(int hotelID) {

        List<Reservation> hotelReservations = new ArrayList<>();
        for (Reservation r : reservations) {
            if (r.getHotelID() == hotelID) {
                hotelReservations.add(r);
            }
        }

        return hotelReservations;
    }

    @Override
    public Reservation get(int reservationID) {
        for (Reservation res : reservations) {
            if (res.getId() == reservationID) {
                return res;
            }
        }
        return null;
    }

    @Override
    public Reservation create(Reservation reservation, int hotelID) {
        reservation.setId(getMaxIdPlusOne());
        this.reservations.add(reservation);
        return reservation;
    }

    @Override
    public void update(Reservation updatedReservation) {
        for (Reservation oldReservation : reservations) {
            if (oldReservation.getId() == updatedReservation.getId()) {
                oldReservation.setFullName(updatedReservation.getFullName());
                oldReservation.setCheckinDate(updatedReservation.getCheckinDate());
                oldReservation.setCheckoutDate(updatedReservation.getCheckoutDate());
                oldReservation.setHotelID(updatedReservation.getHotelID());
                oldReservation.setGuests(updatedReservation.getGuests());
            }
        }
    }

    @Override
    public void delete(int reservationId) {
        Reservation target = null;
        for (Reservation reservation : reservations) {
            if (reservation.getId() == reservationId) {
                target = reservation;
            }
        }
        reservations.remove(target);
    }

    /**
     * finds the max id in the list of reservations and returns it
     *
     * @return int the max id
     */
    private int getMaxID() {
        int maxID = 0;
        for (Reservation r : reservations) {
            if (r.getId() > maxID) {
                maxID = r.getId();
            }
        }
        return maxID;
    }

    /**
     * Adds 1 to the max id and returns it
     *
     * @return
     */
    private int getMaxIdPlusOne() {
        return getMaxID() + 1;
    }

}
