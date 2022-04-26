package NewInTown.controller;

import NewInTown.model.Location;
import NewInTown.model.RestaurantData;
import NewInTown.repository.DateNightRepository;
import NewInTown.repository.DistilleriesAndMoreRepository;
import NewInTown.repository.FamilyOutingsRepository;
import NewInTown.service.restaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;


@Controller
public class NewInTownController {

    @Autowired
    private restaurantService newRestaurantService;

    @Autowired
    private DateNightRepository dateNightRepositoryTitles;

    @Autowired
    private FamilyOutingsRepository familyRepositoryTitles;

    @Autowired
    private DistilleriesAndMoreRepository distilleriesRepositoryTitles;

    //empty string
    static String userSavedCity;


    @RequestMapping( "/")
    public String loadPage() throws IOException {
        RestaurantData restaurantDataTest = newRestaurantService.fetchRestaurantInfo("baltimore", "bars");
        System.out.println(restaurantDataTest.getBusinesses().get(0).getUrl().toString());
//        System.out.println(restaurantDataTest.getBusinesses().get(1).getLocationDetails().getDisplayAddress().get(0));

//
//        //creates a list of all businesses
//        List<Businesses> businessList = restaurantDataTest.getBusinesses();
//
//        //loops through each business object
//        for (int i = 0; i < businessList.size(); i++) {
//            //loops through category after each business
//            for(int x = 0; x < businessList.get(i).getCategories().size(); x++) {
//                System.out.println(businessList.get(i).getCategories().get(x).getTitle());
//            }
//        }
        return "home";
    }

    @RequestMapping("/home")
    public String displayHome (){
        return "home";
    }

    @RequestMapping( "/search")
    public String searchResult (@RequestParam("userEnteredCity") String city, @RequestParam("userEnteredCategory") String category,
                                ModelMap modelMap) throws IOException {
        RestaurantData userInput = newRestaurantService.fetchRestaurantInfo(city, category);
        modelMap.put("userInputKey", userInput);
        //static variable created outside of method is now set to the user input bc of the below
        userSavedCity = city;
        return "search";
    }

    @RequestMapping("/favorites")
    public String displayUsersFavorites (ModelMap modelMap) {
//        modelMap.put("userInputKey", userInput);
        return "favorites";
    }


    @RequestMapping("/datenight")
    public String displayDateNightResults (ModelMap modelMap) throws IOException {
        String category = dateNightRepositoryTitles.dateNightIdeas();
        RestaurantData dateNightCategories = newRestaurantService.fetchRestaurantInfo(userSavedCity, category);
        System.out.println(category);
        modelMap.put("dateNight", dateNightCategories);
        return "datenight";
    }

    @RequestMapping("/familyoutings")
    public String displayFamilyOutingResults (String city, ModelMap modelMap) throws IOException {
        String category = familyRepositoryTitles.familyIdeas();
        RestaurantData familyCategories = newRestaurantService.fetchRestaurantInfo(userSavedCity, category);
        modelMap.put("family", familyCategories);
        return "familyoutings";
    }

    @RequestMapping("/drinks")
    public String displayDrinkResults (String city, ModelMap modelMap) throws IOException {
        String category = distilleriesRepositoryTitles.distilleryIdeas();
        RestaurantData distilleryCategories = newRestaurantService.fetchRestaurantInfo(userSavedCity, category);
        modelMap.put("distillery", distilleryCategories);
        return "drinks";
    }
//consider try catch block when calling service to handle errors
}
