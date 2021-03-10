package lesson11.homeWork;

public class BookingComAPI implements API {
    private Room[] rooms;

    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] arrayRooms = new Room[rooms.length];
        int minPrice = Math.max(price - 100, 0);
        int maxPrice = price + 100;
        int countRooms = 0;
        for (int i = 0; i < rooms.length; i++) {
            if ((minPrice >= rooms[i].getPrice() || rooms[i].getPrice() <= maxPrice) &&
                    persons == rooms[i].getPersons() &&
                    city.equals(rooms[i].getCityName()) &&
                    hotel.equals(rooms[i].getHotelName())) {
                arrayRooms[countRooms] = rooms[i];
                countRooms ++;
            }
        }
        Room[] resArrayRooms = new Room[countRooms + 1];
        for (int i = 0; i < resArrayRooms.length; i++) {
            resArrayRooms[i] = arrayRooms[i];
        }
        return resArrayRooms;
    }

    @Override
    public Room[] getAll() {
        int count = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null){
                count++;
            }
        }
        Room[] withoutNullRooms = new Room[count];
        int index = 0;
        for (int i = 0; i < withoutNullRooms.length; i++){
            if (rooms[i] != null){
                withoutNullRooms[index] = rooms[i];
                index++;
            }
        }
        return withoutNullRooms;
    }
}
