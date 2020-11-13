package com.techelevator.cart;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class CartJdbcDao implements CartDao {

	private JdbcTemplate jdbcTemplate;

	public CartJdbcDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}


	@Override
	public int save(Cart newCart) {
		String sql = "INSERT INTO carts (id, username, cookie_value, created) VALUES (DEFAULT, ?, ?, ?)";
		return jdbcTemplate.update(sql, newCart.getUsername(),newCart.getCookieValue(),newCart.getCreated());

	}

	@Override
	public List<Cart> getAllCarts() {
		List<Cart> cart = new ArrayList<>();
		String sql = "SELECT * FROM carts";

		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while (results.next()) {
			Cart cart1 = mapRowToCart(results);
			cart.add(cart1);
		}
		return cart;
	}

	private Cart mapRowToCart(SqlRowSet results) {
		Cart cartRow = new Cart();
		cartRow.setId(results.getLong("id"));
		cartRow.setUsername(results.getString("username"));
		cartRow.setCookieValue(results.getString("cookie_value"));
		cartRow.setCreated(results.getDate("created").toLocalDate());
		return cartRow;
	}

}
