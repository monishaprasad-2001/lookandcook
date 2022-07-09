package com.example.recipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Chicken Biryani","6 cups - rice (Basmati)" +
                "1 kg - chicken"+
                "3 tbsp - vegetable oil"+
                "3 tbsp - clarified butter" +
                "5 - onion (red, thin sliced)"+
                "3 - potato (peeled and cut)"+
                "30 g - ginger (paste)"+
                "30 g - garlic (paste)"+
                "5 - green chillies (paste)"+
                "10 g - coriander leaves (paste)"+
                "2 tsp - Curry powder"+
                "4 tbsp - yogurt"+
                "4 tbsp - tomato (Puree/paste)"+
                "3 tbsp - red chilli powde"+
                "2 tsps - turmeric powder"+
                "1 pinch - saffron"+
                " salt to taste"+
                "3 tsp - milk"+
                "2-3 drops colour (orange recommended)","Method",
                "Marinate the chicken with garlic, ginger, coriander, green chilli, tomato paste, red chilli powder, turmeric powder, dry garam masala powder, salt and yogurt. Keep it aside for half an hour. Cook rice separately (do not cook fully, keep it semi-cooked), add salt, sprinkle it with colour and keep aside. Heat milk, put a pinch of kesar and keep aside.Heat 2 tbsp of oil in pan. Deep fry half the quantity of onions and all the potatoes till onion is golden brown. Remove both from the pan and keep aside. Fry the remaining onion in the same oil till slight golden brown and put the marinated chicken. Cook for 10 mins. Take a separate utensil, put Ghee and 1 tbsp of oil, half quantity of semi-cooked rice, all fried potatoes and half quantity of fried onions and milk of kesar. Put the cooked chicken on top of it and then cover it with the remaining semi-cooked rice.Garnish with coriander leaves and rest of the fried onions. Tightly cover the utensil and cook for another 10 mins.Serve hot with salad, lemon and papad.\n",R.drawable.chickenbiriyani));

        recipes1.add(new Recipes("Chicken Roll","200 gm chopped into cubes chicken" +
                "1 medium chopped tomato" +
                "1/2 pinch red chilli powder" +
                "2 tablespoon vegetable oil" +
                "1/2 cut into strips cucumber" +
                "1/2 tablespoon chopped coriander leaves" +
                "1 large thinly sliced onion" +
                "2 medium chopped green chilli" +
                "2 pinches garam masala powder" +
                "1 lemon wedges" +
                "1 teaspoon tomato ketchup" +
                "1 tablespoon green chilli sauce","Method",
                "Chicken Roll is a delectable North Indian recipe made using all purpose flour, stir-fried chicken, yoghurt and a variety of vegetables rolled into paranthas. On days you do not want to prepare an elaborate meal, this delectable dish can be a saviour. Rolls are quite popular across India and they are often a favourite evening snack. Egg Roll, Kathi Kebab Roll, Mutton Roll, Paneer Roll, Potato Roll and even Fish Roll are among its many variations. This easy roll recipe is made using chicken and has the unforgettable aroma of Indian spices. You can also utilize your leftover parathas and chapatis in making this recipe. If you do not like to use all-purpose flour or maida, you can make it with whole wheat flour too. In fact, it can be made even with leftover chicken. All you have to ensure is that you use the right amount of spices so that the flavour is not lost. Easy to pack and carry, you can also take it to office or prepare it for picnics and day trips. A must try roll recipe for all chicken lovers!\n",R.drawable.chicken_roll));

        recipes1.add(new Recipes("Chilli Chicken","2 chicken breasts\n" +
                "1 teaspoon salt\n" +
                "½ teaspoon pepper\n" +
                " 1 egg, beaten\n" +
                " ¾ cup flour(100 g)\n" +
                " 1 green pepper, sliced\n" +
                " 1 red pepper, sliced\n" +
                " rice, to serve\n" +
                "CHILLI SAUCE\n" +
                " 3 cloves garlic cloves, crushed\n" +
                " 1 red chilli, chopped\n" +
                " 3 tablespoons soy sauce\n" +
                " 2 tablespoons tomato puree\n" +
                " ½ cup water(100 mL)" +
                "1 cup urad daal (split, skinless black gram)" +
                "3/4 teaspoon fenugreek seeds" +
                "Salt (to taste)" +
                "Vegetable / canola / sunflower cooking oil","Method",
                "Season the chicken with salt and pepper. Cut the chicken into thin strips then coat in the egg wash and flour. Shallow fry for a few minutes on each side, until golden brown. Add the peppers and fry for another couple of minutes. Remove the chicken and peppers and set aside. In the same pan, add the garlic, red chilli, soy sauce, tomato purée, and water. Stir and simmer the mixture reduces and is thick and syrupy. Add back in the chicken and peppers and stir well in the sauce. Serve with rice. Enjoy!",R.drawable.chillichicken));

        recipes1.add(new Recipes("Mutton Curry","4 tablespoons vegetable oil (or canola oil or sunflower cooking oil)\n" +
                "2 large onions, sliced thin\n" +
                " 2 large tomatoes, diced\n" +
                " 2 tablespoons garlic paste\n" +
                " 1 tablespoon ginger paste\n" +
                " 2 teaspoons garam masala powder\n" +
                " 2 teaspoons coriander powder\n" +
                " 1 teaspoon cumin powder\n" +
                " 1/2 teaspoon turmeric powder\n" +
                " 1/2 teaspoon red chili powder\n" +
                " 2 pounds goat (or sheep leg), cut into bite-sized chunks\n" +
                " Kosher salt, to taste\n" +
                " Chopped fresh coriander (cilantro), garnish" +
                "1 cup urad daal (split, skinless black gram)" +
                "3/4 teaspoon fenugreek seeds" +
                "Salt (to taste)" +
                "Vegetable / canola / sunflower cooking oil","Method",
                "Heat the cooking oil in a heavy-bottomed large pan over medium heat.  When hot, add the onions. Sauté until the onions begin to turn a pale golden brown. Remove from the oil with a slotted spoon and drain on paper towels. Turn off the heat but leave the remaining oil in the pan. When hot, add the onions. Sauté until the onions begin to turn a pale golden brown. Remove from the oil with a slotted spoon and drain on paper towels. Turn off the heat but leave the remaining oil in the pan. Grind the tomatoes and garlic and ginger pastes together in the food processor into a smooth paste. Set aside for later use. Heat the oil over medium heat leftover from frying the onions and add the onion paste. Sauté for 2 to 3 minutes. Add the tomato, garlic, and ginger paste followed by the garam masala, coriander, cumin, turmeric, and red chili powder. Mix well. Sauté the resulting masala (onion-tomato-spice mixture) until the oil begins to separate from it. This can take up to 10 minutes. Add the goat or sheep pieces to the masala, season with salt to taste, and stir to fully coat the meat with the masala. Sauté until the goat or sheep is browned well. Add 1/2 a cup of hot water to the pan and stir to mix well. Bring to a simmer and cover the pan. Cook until the meat is tender. You will need to keep checking on the goat or sheep as it cooks and adding more water to the sauce if all the water dries up. Stir often to prevent burning. The dish should have a fairly thin cooked and the sauce has thickened, garnish with chopped coriander and serve hot.",R.drawable.muttoncurry));

        recipes1.add(new Recipes("Donut","1 c. whole milk" +
                "1/4 c. plus 1 tsp. granulated sugar, divided" +
                "1 packet (or 2 1/4 tsp.) active dry yeast " +
                "4 c. all-purpose flour, plus more if needed" +
                "1/2 tsp. kosher salt" +
                "6 tbsp. melted butter" +
                "2 large eggs" +
                "1/2 tsp. pure vanilla extract" +
                "Canola or vegetable oil, for frying","Method","\n" +
                "Grease a large bowl with cooking spray and set aside. In a small, microwave-safe bowl or glass measuring cup, add milk. Microwave until lukewarm, 40 seconds. Add a teaspoon of sugar and stir to dissolve, then sprinkle over yeast and let sit until frothy, about 8 minutes.\n" +
                "Make glaze: In a large bowl, whisk together milk, powdered sugar, and vanilla until smooth. Set aside.\n" +
                "Line a large baking sheet with paper towels. In a large dutch oven over medium heat, heat 2'' oil to 350°. Cook doughnuts, in batches, until deeply golden on both sides, about 1 minute per side. Holes will cook even faster!\n" +
                "Transfer doughnuts to paper towel-lined baking sheet to drain and cool slightly. Dip into glaze, then place onto a cooling rack (or eat immediately!)",R.drawable.donut1));

        recipes1.add(new Recipes("Dosa","3 cups rice" +
                "1 cup urad daal (split, skinless black gram)" +
                "3/4 teaspoon fenugreek seeds" +
                "Salt (to taste)" +
                "Vegetable / canola / sunflower cooking oil","Method",
                "Wash the rice and urad daal well. Add the fenugreek seeds to the mix and fill enough water in the rice-daal bowl to cover them about 2-inch deep. Soak overnight.\n" +
                "Put some cooking oil in a small bowl and keep ready. You will also need a bowl of ice cold water, a large, flat nonstick pan, 2 sheets of paper towel, a ladle, a spatula, and a basting brush.\n" +
                "When the upper surface begins to look cooked (it will no longer look soft or runny), flip the dosa. By this time, ideally, the surface that was underneath should be light golden in color. Cook for 1 minute after flipping.\n" +
                "The dosa is almost done. Fold it in half and allow to cook for 30 seconds more.",R.drawable.dosa1));

        recipes1.add(new Recipes("Puliyogare","100 grams tamarind\n" +
                "2 cup hot water\n" +
                " ¼ cup oil\n" +
                " 1 tsp mustard\n" +
                " 1 dried red chilli\n" +
                " pinch hing / asafoetida\n" +
                " few curry leaves\n" +
                " ½ tsp turmeric\n" +
                " 50 grams jaggery\n" +
                " 1 tsp salt\n" +
                "For puliyogare masala powder:\n" +
                " 2 tbsp sesame\n" +
                " 2 tsp oil\n" +
                " 2 tbsp coriander seeds\n" +
                " 1 tbsp cumin / jeera\n" +
                " 1 tbsp urad dal\n" +
                " 1 tbsp chana dal\n" +
                " ½ tsp mustard\n" +
                " ½ tsp pepper\n" +
                " ¼ tsp methi / fenugreek\n" +
                " ¼ cup dry coconut sliced\n" +
                " 7 dried red chilli\n" +
                " few curry leaves\n" +
                "For rice:\n" +
                " 2 tbsp oil\n" +
                " ½ tsp mustard\n" +
                " 1 tsp chana dal\n" +
                " ½ tsp urad dal\n" +
                " 2 tbsp peanuts\n" +
                " 1 dried red chilli\n" +
                " few curry leaves\n" +
                " 2 cup cooked rice\n" +
                " ½ tsp salt\n" +
                " 2 tbsp coconut grated","Method",
                "firstly, in kadai heat 2 tbsp oil and splutter ½ tsp mustard, 1 tsp chana dal, ½ tsp urad dal and 2 tbsp peanuts. now add 1 dried red chilli and few curry leaves. saute for a minute. further, add prepared 2 tbsp puliyogare gojju and saute for a minute. add in 2 cup cooked rice, ½ tsp salt and mix well. mix unitl the rice is well combined with gojju. use your hands for best results. further, add 2 tbsp coconut and mix well. finally, enjoy puliyogare recipe with curd and papad.",R.drawable.puliyogare));

        recipes1.add(new Recipes("Pancake","1 1/4 cups milk" +
                "1 egg" +
                "3 tablespoons butter melted" +
                "1 1/2 cups all-purpose flour" +
                "3 1/2 teaspoons baking powder" +
                "1 teaspoon salt" +
                "1 tablespoon white sugar","Method",
                "In a large bowl, sift together the flour, baking powder, salt and sugar. Make a well in the center and pour in the milk, egg and melted butter; mix until smooth." +
                "Heat a lightly oiled griddle or frying pan over medium high heat. Pour or scoop the batter onto the griddle, using approximately 1/4 cup for each pancake. Brown on both sides and serve hot.",R.drawable.pancakes));

        recipes1.add(new Recipes("Bisi Bele Bath","¼ cup coriander seeds\n" +
                " ¼ cup chana dal\n" +
                " 2 tbsp urad dal\n" +
                " 2 tbsp cumin\n" +
                " ½ tsp methi\n" +
                " 2 tbsp sesame\n" +
                " 2 tbsp poppy seeds\n" +
                " ½ tsp pepper\n" +
                " 6 pods cardamom\n" +
                " 2 inch cinnamon\n" +
                " 5 cloves\n" +
                " 1 tsp oil\n" +
                " 20 dried red chilli\n" +
                " few curry leaves\n" +
                " ¼ cup dry coconut\n" +
                " ½ tsp turmeric\n" +
                " ¼ tsp hing for pressure cooking:\n" +
                " ½ cup toor dal (soaked 20 minutes)\n" +
                " ½ cup rice\n" +
                " ¼ tsp turmeric\n" +
                " 1 tsp oil\n" +
                " 3 cup water for bisi bele bath:\n" +
                " 2 tbsp oil\n" +
                " 2 tbsp ghee\n" +
                " 1 tsp mustard\n" +
                " 2 dried red chilli\n" +
                " pinch hing\n" +
                " 2 tbsp peanuts\n" +
                " few curry leaves\n" +
                " ½ onion (cubed)\n" +
                " 1 carrot (chopped)\n" +
                " 1 potato (cubed)\n" +
                " 2 tbsp peas\n" +
                " 5 beans (chopped)\n" +
                " ½ tomato (chopped)\n" +
                " ½ tsp turmeric\n" +
                " ½ cup tamarind extract\n" +
                " 3 tbsp bisi bele bath masala\n" +
                " 1 tsp chilli powder\n" +
                " 1 tsp salt\n" +
                " 5 cup water for tempering:\n" +
                " 2 tsp ghee\n" +
                " 2 tbsp cashew" ,"Method",
                "firstly, in a heavy-bottomed pan take ¼ cup coriander seeds, ¼ cup chana dal, 2 tbsp urad dal, 2 tbsp cumin, ½ tsp methi, 2 tbsp sesame and 2 tbsp poppy seeds. roast on low flame until the spices turn aromatic. also add ½ tsp pepper, 6 pods cardamom, 2 inch cinnamon, 5 cloves. roast on low flame without burning the spices. transfer to the plate to cool completely. in the pan heat 1 tsp oil and add 20 dried red chilli, few curry leaves and ¼ cup dry coconut. roast on low flame until the chilli turns crisp. transfer to the same plate and allow to cool completely. once the roasted spices are cooled completely, transfer to the mixer jar. add ½ tsp turmeric and ¼ tsp hing. blend to a fine powder and homemade bisi bele bath masala powder is ready. how to make Karnataka style bisibele bath: • firstly, in a pressure cooker take ½ cup toor dal, ½ cup rice, ¼ tsp turmeric and 1 tsp oil. add 3 cup of water and pressure cook for 5 whistles. keep aside. in a large kadai heat 2 tbsp oil, 2 tbsp ghee and splutter 1 tsp mustard, 2 dried red chilli, pinch hing, 2 tbsp peanuts and few curry leaves. add ½ onion and saute slightly. now add 1 carrot, 1 potato, 2 tbsp peas, 5 beans, ½ tomato, ½ tsp turmeric and ½ tsp salt. saute for 2 minutes, or until the vegetables soften slightly. now add 3 cup water and boil for 10 minutes or until the vegetables are cooked well. further, add ½ cup tamarind extract and boil well. add 3 tbsp bisi bele bath masala, 1 tsp chilli powder and 1 tsp salt. saute until the spices are well cooked. add cooked rice-dal, 1 tsp salt, 2 cup water and mix well adjusting the consistency. cover and simmer for 10 minutes, or until the flavours are absorbed well. now pour the fried cashew and mix well. i have fried 2 tbsp cashew in 2 tsp ghee until the cashew turn crunchy. finally, enjoy bisi bele bath recipe with boondi and raita.",R.drawable.bisibelebath));

        recipes1.add(new Recipes("Pasta","1 tsp oil" +
                "1 tsp butter" +
                "2 clove garlic, finely chopped" +
                "1 inch ginger, finely chopped" +
                "½ onion, finely chopped" +
                "1 cup tomato pulp" +
                "¼ tsp turmeric / haldi" +
                "½ tsp kashmiri red chilli powder" +
                "2 tbsp tomato sauce" +
                "½ tsp garam masala","Method",
                "firstly, saute 1 inch ginger and 2 clove garlic in 1 tsp oil and 1 tsp butter." +
                "further saute ½ onion till they turn soft." +
                "additionally add 1 cup tomato pulp and saute well." +
                "keep stirring till the tomato pulp thickens." +
                "now add ¼ tsp turmeric, ½ tsp chilli powder, ½ tsp garam masala and ½ tsp salt." +
                "saute till the spices gets cooked completely." +
                "now add 2 tbsp corn, ¼ capsicum, ¼ carrot, 2 tbsp peas and 7 florets broccoli. saute for a minute." +
                "add in 3 tbsp water and mix well." +
                "cover and simmer for 5 minutes." +
                "now add in 2 tbsp tomato sauce and ½ tsp mixed herbs. mix well." +
                "add in cooked pasta and mix gently till the sauce gets coated well." +
                "finally, serve masala pasta indian style hot topped with cheese if required.",R.drawable.pasta1));





        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this,recipes1);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        myrecyclerView.setAdapter(myAdapter);



    }

}
