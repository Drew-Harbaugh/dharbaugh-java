package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds= initialNumberOfBirds -birdsThatFlewAway;
		System.out.println(remainingNumberOfBirds);

		/*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		System.out.println(numberOfExtraBirds);


        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */

		int numberOfRacoons = 3;
		int numberOfLeavingRacoons= 2;
		int numberOfRemaingRaccons = numberOfRacoons - numberOfLeavingRacoons;
		System.out.println(numberOfRemaingRaccons);


        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int numberOfBeesNeeded = numberOfFlowers - numberOfBees;
		System.out.println(numberOfBeesNeeded);

        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */

		int initialPigeons = 1;
		int joiningPigeons = 1;
		int totalPigeons = initialPigeons + joiningPigeons;
		System.out.println(totalPigeons);

        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */

		int intialOwls = 3;
		int joiningOwls = 2;
		int totalOwls = intialOwls + joiningOwls;
		System.out.println(totalOwls);

        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */

		int numberOfWorkingBeavers = 2;
		int numberOfSwimmingBeavers = 1;
		int numberOfRemainingBeavers= numberOfWorkingBeavers - numberOfSwimmingBeavers;
		System.out.println(numberOfRemainingBeavers);

        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */

		int initalNumberOfToucans = 2;
		int joiningNumberOfToucans = 1;
		int totalNumberOfToucans = initalNumberOfToucans + joiningNumberOfToucans;
		System.out.println(totalNumberOfToucans);

        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */

		int numberOfSquirrels = 4;
		int numberOfNuts = 2;
		int numberOfRemainingSquirrels = numberOfSquirrels - numberOfNuts;
		System.out.println(numberOfRemainingSquirrels);

        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */

		double quater = .25 * 1;
		double dime = .10 * 1;
		double nickel = .05 * 2;
		double totalAmountOfMoney = quater + dime + nickel;
		System.out.println(totalAmountOfMoney);

        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */

		int mrsBriersClass = 18;
		int mrsMacAdamsClass = 20;
		int mrsFlannerysClass = 17;
		int totalOfFirstGradeMuffins = mrsBriersClass + mrsMacAdamsClass + mrsFlannerysClass;
		System.out.println(totalOfFirstGradeMuffins);



		/*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */

		double yoyo = .24;
		double whistle = .14;
		double moneySpentOnToys = yoyo + whistle;
		System.out.println(moneySpentOnToys);

        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */

		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int totalMarshmallows = largeMarshmallows + miniMarshmallows;
		System.out.println(totalMarshmallows + (" Marshmallows"));

        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */

		int snowDepthMrsHiltsHouse = 29;
		int snowDepthBrecknock = 17;
		int differenceOfSnowDepth= snowDepthMrsHiltsHouse - snowDepthBrecknock;
		System.out.println(differenceOfSnowDepth + (" inches"));

        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */

		int intialMoney = 10;
		int costOfToyTruck = 3;
		int costOfPencil = 2;
		int remainingMoney = intialMoney - costOfPencil - costOfToyTruck;
		System.out.println(remainingMoney);



        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */

		int initialNumberOfMarbles = 16;
		int lostNumberOfMarbles = 7;
		int remainingNumberOfMarbles = initialNumberOfMarbles - lostNumberOfMarbles;
		System.out.println(remainingNumberOfMarbles);

        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */

		int collectedSeashells = 19;
		int totalSeashellsWanted= 25;
		int amountOfSeashellsNeeded = totalSeashellsWanted - collectedSeashells;
		System.out.println(amountOfSeashellsNeeded);

        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */

		int totalAmountOfBaloons = 17;
		int numberOfRedBaloons = 8;
		int numberOfGreenBaloons = totalAmountOfBaloons - numberOfRedBaloons;
		System.out.println(numberOfGreenBaloons);

        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */

		int initialNumberOfBooksOnShelf = 38;
		int addedNumberOfBookOnShelf = 10;
		int totalNumberOfBooksOnShelf = initialNumberOfBooksOnShelf + addedNumberOfBookOnShelf;
		System.out.println(totalNumberOfBooksOnShelf);

        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */

		int totalOfLegsOnEightBees = 6 * 8;
		System.out.println(totalOfLegsOnEightBees);

        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */

		double totalPriceOfTwoIceCreamCones = .99 * 2;
		System.out.println(totalPriceOfTwoIceCreamCones);


        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */

		int amountOfRocksObtained = 64;
		int amountOfRocksNeeded = 125;
		int amountOfRocksMissing = amountOfRocksNeeded - amountOfRocksObtained;
		System.out.println(amountOfRocksMissing);

        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */

		int totalMarbles = 38;
		int lostMarbles = 15;
		int newTotalMarbles = totalMarbles - lostMarbles;
		System.out.println(newTotalMarbles);

        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */

		int totalMilesToConcert = 78;
		int drivenMiles = 32;
		int milesLeftToDrive = totalMilesToConcert - drivenMiles;
		System.out.println(milesLeftToDrive);

        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */

		double saturdayMorningTimeShovelingSnow = 1.5;
		double saturdayAfternoonTimeSholvelingSnow = .75;
		double totalTimeShovelingSnow = saturdayMorningTimeShovelingSnow + saturdayAfternoonTimeSholvelingSnow;
		System.out.println(totalTimeShovelingSnow);

        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */

		double hotdogPrice = .50;
		int totalHotdogs = 6;
		double moneySpentOnHotdogs = hotdogPrice * totalHotdogs;
		System.out.println(moneySpentOnHotdogs);

        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */

		double totalSpendingMoney = .50;
		double pencilPrice = .07;
		double numberOfPencilsBought = totalSpendingMoney / pencilPrice;
		System.out.println(numberOfPencilsBought);

        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */

		int numberOfButterflies = 33;
		int orangeButterflies = 20;
		int redButterflies = numberOfButterflies - orangeButterflies;
		System.out.println(redButterflies);

        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */

		double moneyGiven = 1.00;
		double candyCost = .54;
		double changeRecieved = moneyGiven - candyCost;
		System.out.println(changeRecieved);

        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */

		int treesPlanted = 13;
		int treesToBePlanted = 12;
		int totalTrees = treesPlanted + treesToBePlanted;
		System.out.println(totalTrees);

        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */

		int hoursInADay = 24;
		int daysToSeeGrandma = 2;
		int hoursToSeeGrandma = hoursInADay * daysToSeeGrandma;
		System.out.println(hoursToSeeGrandma);

        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */

		int amountOfCousins = 4;
		int gumToBeGivenEach= 5;
		int totalAmountNeeded = amountOfCousins * gumToBeGivenEach;
		System.out.println(totalAmountNeeded);

        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */

		double moneyInPossesion = 3.00;
		double candybarCost = 1.00;
		double moneyRemaining = moneyInPossesion - candybarCost;
		System.out.println("$" + moneyRemaining);

        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */

		int amountOfBoats = 5;
		int personPerBoat = 3;
		int totalPeople = amountOfBoats * personPerBoat;
		System.out.println(totalPeople);

        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */

		int originalCountOfLegos = 380;
		int lostLegos = 57;
		int newCountOfLegos = originalCountOfLegos - lostLegos;
		System.out.println(newCountOfLegos);

        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */

		int bakedMuffins = 35;
		int totalBakedMuffins = 83;
		int neededBakedMuffins = totalBakedMuffins - bakedMuffins;
		System.out.println(neededBakedMuffins);

        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */

		int willyCrayonAmount = 1400;
		int lucyCrayonAmount = 290;
		int differenceCrayonAmount= willyCrayonAmount - lucyCrayonAmount;
		System.out.println(differenceCrayonAmount);

        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */

		int stickersPerPage = 10;
		int pageAmount = 22;
		int totalStickers = stickersPerPage * pageAmount;
		System.out.println(totalStickers);

        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */

		int amountOfCupcakes = 96;
		int amountOfChildren = 8;
		int cupcakesToShare = amountOfCupcakes / amountOfChildren;
		System.out.println(cupcakesToShare);

        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */

		int amountOfGingerbreadCookies = 47;
		int gingerbreadCookiesPerJar = 6;
		int gingerbreadCookiesRemaining = amountOfGingerbreadCookies % gingerbreadCookiesPerJar;
		System.out.println(gingerbreadCookiesRemaining);

        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */

		int numberOfCroissantsPrepared = 59;
		int croissantsGivenPerNeighbor = 8;
		int remainingCroissants = numberOfCroissantsPrepared % croissantsGivenPerNeighbor;
		System.out.println(remainingCroissants);

        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */

		int totalCookiesToBePrepared = 276;
		int cookinesPerTray = 12;
		int totalOfTraysNeeded = totalCookiesToBePrepared / cookinesPerTray;
		System.out.println(totalOfTraysNeeded);

        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */

		int totalPretzelsMade = 480;
		int oneServingOfPretzels = 12;
		int totalServinngsPrepared = totalPretzelsMade / oneServingOfPretzels;
		System.out.println(totalServinngsPrepared);

        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */

		int lemonCupcakes = 53;
		int lemonCupcakesLeftBehind = 2;
		int newTotalOfLemonCupcakes = lemonCupcakes - lemonCupcakesLeftBehind;
		int lemonCupcakesPerBox = 3;
		int boxesGivenAway = newTotalOfLemonCupcakes / lemonCupcakesPerBox;
		System.out.println(boxesGivenAway);

        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */

		int carrotStickPrepared = 74;
		int numberOfPeopleEquallyServed = 12;
		int numberOfUneatenCarrotSticks = carrotStickPrepared % numberOfPeopleEquallyServed;
		System.out.println(numberOfUneatenCarrotSticks);

        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */

		int teddyBearsGathered = 98;
		int shelfCarryCapacity = 7;
		int numberOfShelvesFilled = teddyBearsGathered / shelfCarryCapacity;
			System.out.println(numberOfShelvesFilled);

        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */

		int numberOfPictures = 480;
		int albumPicureCapacity = 20;
		int numberOfAlbumsNeeded = numberOfPictures / albumPicureCapacity;
			System.out.println(numberOfAlbumsNeeded);

        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */

		int numberOfTradingCards = 94;
		int boxCardCapacity = 8;
		int filledBox = numberOfTradingCards / boxCardCapacity;
		int numberOfCardsInUnfilledBox = numberOfTradingCards % boxCardCapacity;

		System.out.println(filledBox);
		System.out.println(numberOfCardsInUnfilledBox);

        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */

		int numberOfBooks = 210;
		int numberOfShelvesRepaired = 10;
		int numberOfBooksPerShelf = numberOfBooks / numberOfShelvesRepaired;
		System.out.println(numberOfBooksPerShelf);


        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */

		int croissantsBaked = 17;
		int guestsToBeServedEqually = 7;
		int numberOfCroissantsGiven = croissantsBaked / guestsToBeServedEqually;
		System.out.println(numberOfCroissantsGiven);

        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */

		double billHourlyPaintingRate = 2.15;
		double jillHourlyPaintingRate = 1.9;
		double combinedHourlyPaintingRate = billHourlyPaintingRate + jillHourlyPaintingRate;
		int roomSize = 12 + 14;
		int totalRooms = 5;
		int totalSizeToBePainted = roomSize * totalRooms;
		double numberOfHoursToPaintRoooms = totalSizeToBePainted / combinedHourlyPaintingRate;
		int newTotalRooms = 623;
		int newTotalSizeToBePainted = newTotalRooms * roomSize;
		double newNumberOfHoursToPaintRooms = newTotalSizeToBePainted + combinedHourlyPaintingRate;
		double numberOfHoursADay = 8;
		double daysToFinishPainting = newNumberOfHoursToPaintRooms / numberOfHoursADay;

		System.out.println(numberOfHoursToPaintRoooms);
		System.out.println(daysToFinishPainting);




        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */

		String firstName = "Drew";
		String lastName = "Harbaugh";
		String middleName = " A";
		String fullName = '"'+ lastName + ", " + firstName + middleName + "."+'"';
		System.out.println(fullName);




        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */

		double milesToBeTravelled = 800;
		double milesAlreadyTravelled = 537;
		double percantageCompleted = milesAlreadyTravelled / milesToBeTravelled *100;
		int finalPercantageCompleted = (int)percantageCompleted;
			System.out.println(finalPercantageCompleted);





	}

}
