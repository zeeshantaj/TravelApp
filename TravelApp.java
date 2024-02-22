package org.example;

import java.util.ArrayList;
import java.util.Random;

public class TravelApp {

    private ArrayList<Flight> flights;
    private ArrayList<Hotel> hotels;

    public TravelApp() {
        this.flights = new ArrayList<>();
        this.hotels = new ArrayList<>();
    }

    public void SearchFlight(String origin, String destination, String date, int numPassengers){
        System.out.println("Searching for flights from " + origin + " to " + destination + " on " + date + " for " + numPassengers + " passengers.");
    }

    public void SearchHotel(String location,String checkIn,String checkOut,int numGuests){
        System.out.println("Searching for hotels in " + location + " from " + checkIn + " to " + checkOut + " for " + numGuests + " guests.");
    }
    public void BookFlight(int flightNumber,String passengerName,String origin,String destination,String date,int numPassenger,double price){
        Flight flight = new Flight(flightNumber,passengerName,origin,destination,date,numPassenger,price);
        int Confirmation = flight.getConfirmationNumber();
        flight.setConfirmationNumber(Confirmation);
        System.out.println("Flight booked! Confirmation number: " + Confirmation);
    }

    public void BookHotel(  int hotelId, String name, String location, String checkIn, String checkOut, int numGuests, double price){
        Hotel hotel = new Hotel(hotelId,name,location,checkIn,checkOut,numGuests,price);
        int confirmation = hotel.getConfirmationNumber();
        hotel.setConfirmationNumber(confirmation);
        System.out.println("Hotel booked! Confirmation number: " + confirmation);
    }

    public void CancelReservation(int confirmation){
        for (Flight flight : this.flights){
            if (flight.getConfirmationNumber() == confirmation){
                this.flights.remove(flight);
                System.out.println("Flight reservation with confirmation number " + confirmation + " cancelled.");
                return;
            }
        }
        for (Hotel hotel : this.hotels){
            if (hotel.getConfirmationNumber() == confirmation){
                this.hotels.remove(hotel);
                System.out.println("Hotel reservation with confirmation number " + confirmation + " cancelled.");
                return;
            }
        }
        System.out.println("No reservation found with confirmation number " + confirmation + ".");

    }

    public int generateConfirmationNumber(){
        Random random = new Random();
        return random.nextInt(90000) + 10000;
    }


}
