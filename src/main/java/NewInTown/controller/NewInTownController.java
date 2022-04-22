package NewInTown.controller;

import NewInTown.model.Businesses;
import NewInTown.model.RestaurantData;
import NewInTown.service.restaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.net.URL;
import java.util.List;


@Controller
public class NewInTownController {

    @Autowired
    private restaurantService newRestaurantService;

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

    @RequestMapping("/search")
    public String searchResult (@RequestParam("userEnteredCity") String city, @RequestParam("userEnteredCategory") String category,
                                ModelMap modelMap) throws IOException {
        RestaurantData userInput = newRestaurantService.fetchRestaurantInfo(city, category);
        modelMap.put("userInputKey", userInput);
        return "search";
    }

    @RequestMapping("/home")
    public String displayHome (){
        return "home";
    }

    @RequestMapping("/favorites")
    public String displayUsersFavorites (ModelMap modelMap) {
//        modelMap.put("userInputKey", userInput);
        return "favorites";
    }

//How do I save userinputs to reflect these?
//How to include multiple categories?
    @RequestMapping("/datenight")
    public String displayDateNightResults (String city, String category, ModelMap modelMap) throws IOException {
        RestaurantData dateNightCategories = newRestaurantService.fetchRestaurantInfo("baltimore", category);
        if (category.equals("jazzandblues") || category.equals("wine_bars") || category.equals("comedyclubs")) {
            modelMap.put("dateNight", dateNightCategories);
        }
        return "datenight";
    }

    @RequestMapping("/familyoutings")
    public String displayFamilyOutingResults (ModelMap modelMap) {
//        modelMap.put("userInputKey", userInput);
        return "familyoutings";
    }
//consider try catch block when calling service to handle errors
}
