package org.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        TravelApp app = new TravelApp();
        app.SearchFlight("New York","London","12/11/2023",1);
        app.SearchHotel("London","12/11/2023","15/11/2023",1);
        app.BookFlight(12345670, "Martin Nadine", "New York", "London", "2022-08-01", 1, 700.00);
        app.BookFlight(67843513, "Jennifer Ulrike", "New York", "London", "2022-08-01", 1, 655.00);
        app.BookHotel(98765432, "Martin Nadine", "London", "2022-09-01", "2022-09-05", 1, 100.00);

        app.CancelReservation(12345670);
    }
}