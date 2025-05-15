var showtimes = current().<MqlDocument>getArray("showtimes");

asList(project(fields(
    computed("availableShowtimes", showtimes
        .filter(showtime -> {
            var seats = showtime.<MqlInteger>getArray("seats");
            var totalSeats = seats.sum(n -> n);
            var ticketsBought = showtime.getInteger("ticketsBought");
            var isAvailable = ticketsBought.lt(totalSeats);
            return isAvailable;
        }))
)));