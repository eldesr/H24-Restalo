package ca.ulaval.glo2003;

import java.time.LocalTime;
import java.util.List;

public class Restaurant {
        /***
         * AHHHHHHHHHHH
        private RestaurantRespository restaurantRepository;

        public RestaurantService() {
        }

        public ca.ulaval.glo2003.entity.Error verifyOwnerID(String ownerID){
            if(checkStringEmpty(ownerID)){
                return createMissingError("Missing owner ID.");
            }
            if(!isExistingOwnerID(ownerID)){
                return createInvalidError("Invalid owner ID.");
            }
            return null;
        }

        public ca.ulaval.glo2003.entity.Error verifyCreateRestaurantReq(String ownerID, Restaurant restaurant){
            if(emptyRestaurantParameter(restaurant)){
                return createMissingError("Missing restaurant parameter.");
            }
            if(!validRestaurant(restaurant)){
                return createInvalidError("Invalid restaurant parameter.");
            }
            return null;
        }

        public void addRestaurantRepository(String ownerID, Restaurant restaurant){
            restaurantRepository.addRestaurant(Integer.parseInt(ownerID), restaurant);
        }

        public ca.ulaval.glo2003.entity.Error verifyGetRestaurantReq(String ownerID, String restaurantID){
            if(!restaurantBelongsToOwner(restaurantID, ownerID)){
                return createInvalidError("Invalid restaurant ID.");
            }
            return null;
        }

        public Restaurant getOwnerRestaurant(String ownerID, String restaurantID){
            int restaurantIDInt = Integer.parseInt(restaurantID);
            int ownerIDInt = Integer.parseInt(ownerID);
            return restaurantRepository.getRestaurant(ownerIDInt, restaurantIDInt);
        }



        public List<Restaurant> getAllOwnerRestaurants(String ownerID){
            int ownerIDInt = Integer.parseInt(ownerID);
            return restaurantRepository.getAllRestaurants(ownerIDInt);
        }

        private Boolean restaurantBelongsToOwner(String restaurantID, String ownerID){
            try{
                int restaurantIDInt = Integer.parseInt(restaurantID);
                int ownerIDInt = Integer.parseInt(ownerID);
                restaurantRepository.getRestaurant(ownerIDInt, restaurantIDInt);
                return true;
            } catch (Exception e){
                return false;
            }
        }

        private Boolean emptyRestaurantParameter(Restaurant restaurant){
            String name = restaurant.getName();
            LocalTime openTime = restaurant.getHours().getOpen();
            LocalTime closeTime = restaurant.getHours().getClose();

            if(checkStringEmpty(name) || (name == null)){
                return true;
            }

            if(openTime == null || closeTime == null){
                return true;
            }

            return false;
        }

        private Boolean validRestaurant(Restaurant restaurant){
            if(!validOpeningHours(restaurant.getHours())){
                return false;
            }
            if(!validCapacity(restaurant.getCapacity())){
                return false;
            }
            return true;
        }

        private ca.ulaval.glo2003.entity.Error createInvalidError(String description){
            return new ca.ulaval.glo2003.entity.Error(ErrorType.INVALID_PARAMETER, description);
        }

        private ca.ulaval.glo2003.entity.Error createMissingError(String description){
            return new ca.ulaval.glo2003.entity.Error(ErrorType.MISSING_PARAMETER, description);
        }



        private Boolean validCapacity(int capacity){
            if(capacity <= 0){
                return false;
            }
            return true;
        }

        private Boolean validOpeningHours(Hours openingHours){
            LocalTime openTime = openingHours.getOpen();
            LocalTime closeTime = openingHours.getClose();

            int timeOpen = openTime.getHour() - closeTime.getHour();
            if (timeOpen < 1){
                return false;
            }

            return true;
        }


        private Boolean isExistingOwnerID(String ID){
            for (Proprietaire owner: restaurantRepository.getProprietaires()){
                String ownerID = Integer.toString(owner.getNoProprietaire());
                if (ID.equals(ownerID)){
                    return true;
                }
            }
            return false;
        }

        private Boolean checkStringEmpty(String string){
            String stringWithoutSpaces = string.replaceAll("\\s", "");
            if(stringWithoutSpaces.isEmpty()){
                return true;
            }
            return false;
        }

         public static void main(String[] args) {
         RestaurantService service = new RestaurantService();

         int ownerID = 1000;
         Restaurant resto1 = new Restaurant();
         resto1.setName("Ali");
         resto1.setCapacity(1);
         LocalTime open1 = LocalTime.of(12, 12, 12);
         LocalTime close1 = LocalTime.of(16, 16, 16);
         Hours hours1 = new Hours(open1, close1);
         resto1.setHours(hours1);
         service.addRestaurantRepository(ownerID, resto1);

         Restaurant resto2 = new Restaurant();
         resto2.setName("Bli");
         resto2.setCapacity(2);
         LocalTime open2 = LocalTime.of(10, 12, 12);
         LocalTime close2 = LocalTime.of(14, 16, 16);
         Hours hours2 = new Hours(open2, close2);
         resto2.setHours(hours2);
         service.addRestaurantRepository(ownerID, resto2);

         Restaurant resto3 = new Restaurant();
         resto3.setName("Cli");
         resto3.setCapacity(3);
         LocalTime open3 = LocalTime.of(9, 12, 12);
         LocalTime close3 = LocalTime.of(13, 16, 16);
         Hours hours3 = new Hours(open3, close3);
         resto3.setHours(hours3);
         service.addRestaurantRepository(ownerID, resto3);

         ca.ulaval.glo2003.entity.Error error = service.verifyCreateRestaurantReq(resto1);
         if(error == null){
         System.out.println("Yellow");
         }
         else{
         System.out.println(error);
         }

         try{
         int resto1ID = resto1.getNoRestaurant();
         service.verifyGetRestaurantReq(ownerID, resto1ID);
         List<Restaurant> listAttendue = new ArrayList<>();
         listAttendue.add(resto1);
         listAttendue.add(resto2);
         listAttendue.add(resto3);
         List<Restaurant> allResto = service.getAllOwnerRestaurants(ownerID);
         if(allResto.equals(listAttendue)){
         System.out.println("COPIE");
         System.out.println(listAttendue);
         System.out.println(allResto);
         }
         } catch (Exception e){
         System.out.println("Failedddd");
         }
         }

        ***/

    }

