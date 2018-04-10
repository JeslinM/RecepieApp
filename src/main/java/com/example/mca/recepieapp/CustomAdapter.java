package com.example.mca.recepieapp;

import android.content.Context;
import android.text.Layout;
import android.text.NoCopySpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by mca on 3/28/2018.
 */

public class CustomAdapter extends BaseAdapter {
    Context c;
    int[] image= new int[]{R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6,
            R.drawable.image7,
            R.drawable.image8,
            R.drawable.image9,
            R.drawable.image10};
    String[]Recepie_Name={"ALOO GOBI",
            "BUTTER CHICKEN ",
            "DAL MAKHANI",
            "GULAB JAMUN",
            "BIRIYANI",
            "JALEBI",
            "PAYASAM",
            "TANDOORI CHICKEN",
            "BARFI",
            "CARROT HALWA"};
    String[]Ingredients={"1⁄4 cup vegetable oil\n"+
"1 large onion, peeled and cut into small pieces\n"+
"1 bunch fresh coriander, separated into stalks and leaves and roughly chopped\n"+
"1 small green chili, chopped into small pieces (or one teaspoon chili powder)\n"+
"1 large cauliflower, leaves removed and cut evenly into eighths\n"+
"3 large potatoes, peeled and cut into even pieces\n"+
"2 (8 ounce) cans diced tomatoes fresh ginger, peeled and grated fresh garlic, chopped\n"+
"1 teaspoon cumin seed\n"+
"2 teaspoons turmeric\n"+
"1 teaspoon salt\n"+
"2 teaspoons garam masala\n"+
           "DESCRIPTION\n"+
    "Heat vegetable oil in a large saucepan\n"+
    "Add the chopped onion and one teaspoon of cumin seeds to the oil\n"+
    "Stir together and cook until onions become creamy, golden, and translucent\n"+
    "Add chopped coriander stalks, two teaspoons of turmeric, and one teaspoon of salt\n"+
    "Add chopped chillis (according to taste) Stir tomatoes into onion mixture\n"+
    "Add ginger and garlic; mix thoroughly\n"+
    "Add potatoes and cauliflower to the sauce plus a few tablespoons of water (ensuring that the mixture doesn't stick to the saucepan)\n"+
            "Ensure that the potatoes and cauliflower are coated with the curry sauce\n"+
            "Cover and allow to simmer for twenty minutes (or until potatoes are cooked)\n"+
    "Add two teaspoons of Garam Masala and stir\n"+
    "Sprinkle chopped coriander leaves on top of the curry\n"+
    "Turn off the heat, cover, and leave for as long as possible before serving\n",
            "1 cup butter, divided \n"+"1 onion minced 1\n"+ "tablespoon minced garlic \n"+"1 (15 ounce) can tomato sauce\n"+ "3 cups heavy cream 2 teaspoons salt\n"+ "1 teaspoon cayenne pepper\n"+ "1 teaspoon garam masala\n"+ "1 1/2 pounds skinless, boneless chicken breast, cut into bite-sized chunks\n"+ "2 tablespoons vegetable oil\n"+ "2 tablespoons tandoori masala\n"+ "Add all ingredients to list\n"+
                    "DESCRIPTION\n"+
                    "Preheat oven to 375 degrees F (190 degrees C)\n"+
            "Melt a few tablespoons of butter in a skillet over medium heat\n"+ "Stir in onion and garlic, and cook slowly until the onion caramelizes to a dark brown, about 15 minutes\n"+
            "Meanwhile melt the remaining butter in a saucepan over medium-high heat along with the tomato sauce, heavy cream, salt, cayenne pepper, and garam masala. Bring to a simmer, then reduce heat to medium-low; cover, and simmer for 30 minutes, stirring occasionally\n"+ "Then stir in caramelized onions\n"+
    "While the sauce is simmering, toss cubed chicken breast with vegetable oil until coated, then season with tandoori masala and spread out onto a baking sheet\n"+
    "Bake chicken in preheated oven until no longer pink in the center, about 12 minutes\n"+ "Once done, add the chicken to the sauce and simmer for 5 minutes before serving\n",

            "1 cup lentils\n"+"1/4 cup dry kidney beans (optional) water to cover\n"+ "5 cups water\n"+"2 tablespoons salt\n"+"2 tablespoons vegetable oil\n"+"1 tablespoon cumin seeds\n"+"4 cardamom pods\n"+"1 cinnamon stick, broken 4 bay leaves 6 whole cloves\n"+"1 1/2 tablespoons ginger paste 1 1/2 tablespoons garlic paste\n"+"1/2 teaspoon ground turmeric 1 pinch cayenne pepper, or more to taste\n"+"1 cup canned tomato puree, or more to taste 1 tablespoon chili powder\n"+"2 tablespoons ground coriander 1/4 cup butter 2 tablespoons dried fenugreek leaves (optional) 1/2 cup cream (optional)\n"+
                    "Place lentils and kidney beans in a large bowl; cover with plenty of water. Soak for at least 2 hours or overnight. Drain\n"+"Cook lentils, kidney beans, 5 cups water, and salt in a pot over medium heat until tender, stirring occasionally, about 1 hour. Remove from heat and set aside. Keep the lentils, kidney beans, and any excess cooking water in the pot\n"+"Heat vegetable oil in a saucepan over medium-high heat. Cook cumin seeds in the hot oil until they begin to pop, 1 to 2 minutes. Add cardamom pods, cinnamon stick, bay leaves, and cloves; cook until bay leaves turn brown, about 1 minute. Reduce heat to medium-low; add ginger paste, garlic paste, turmeric, and cayenne pepper. Stir to coat\n"+"Stir tomato puree into spice mixture; cook over medium heat until slightly reduced, about 5 minutes. Add chili powder, coriander, and butter; cook and stir until butter is melted.\n"+"Stir tomato puree into spice mixture; cook over medium heat until slightly reduced, about 5 minutes. Add chili powder, coriander, and butter; cook and stir until butter is melted\n",
            "1 cup dry milk powder\n"+
                    " 3 tablespoons all-purpose flour\n"+
                    "2 tablespoons ghee (clarified butter), melted\n"+
                    "1/2 teaspoon baking powder \n"+
                    "1/2 cup warm milk\n"+
                    "1 tablespoon chopped almonds (optional)\n"+
                    "1 tablespoon chopped pistachio nuts (optional)\n"+
                    "1 tablespoon golden raisins (optional)\n"+
                    "1 pinch ground cardamom\n"+
                    "1 quart vegetable oil for deep frying\n"+
                    "1 1/4 cups white sugar\n"+
                    "7 fluid ounces water\n"+
                    "1 teaspoon rose water\n"+
                    "1 pinch ground cardamom",
            "2 1/2 tablespoons olive oil\n"+
                    "3 tablespoons plain yogurt\n"+
                    "2 tablespoons distilled white vinegar\n"+
                    "1 medium onion,sliced\n"+
                    "2 cloves garlic, crushed\n"+
                    "1 tablespoon ginger paste\n"+
                    "2 small green chile peppers\n"+
                    "2 medium tomatoes, chopped\n"+
                    "2 tablespoons garam masala\n"+
                    "1 tablespoon dried mint\n"+
                    "salt and pepper to taste\n"+
                    "5 sprigs cilantro\n"+
                    "1 (3 pound) whole chicken, skin removed and cut into pieces\n"+
                    "2 quarts water 4 cups uncooked basmati rice\n"+
                    "1 bay leaf\n"+
                    "4 pods green cardamom\n"+
                    "1 pod black cardamom\n"+
                    "1 cinnamon stick salt to taste\n"+
                    "1/4 teaspoon powdered yellow food coloring\n"+
                    "1 cup (140g) all-purpose flour (maida)[2]\n"+
                    "2 tbsp (16g) Bengali gram, corn, or rice flour\n"+
                    "3⁄4 cup (177 ml) plain yogurt, 1⁄2 cup (118 ml) buttermilk\n"+
                    "1/2 tsp (4g) baking soda\n"+
                    "2 tbsp (30g) melted ghee or clarified butter\n"+
                    "3-4 threads saffron, or 4-5 drops yellow food coloring\n"+
                    "Water, as needed\n",
            "2 cup milk\n" +
                    "1 tablespoon basmati rice\n" +
                    "1/2 teaspoon ghee\n" +
                    "1/4 teaspoon cardamom essence\n" +
                    "saffron as required\n" +
                    "1/4 teaspoon sugar\n","Vermicelli\t1 cup\n" +
            "Cashew nuts\thandful\n" +
            "Raisins\thandful\n" +
            "Water\t3/4cup\n" +
            "Sugar\ta cup\n" +
            "Saffron\ta pinch\n" +
            "Milk\ta cup\n" +
            "Cardamom\ttwo or three pods\n"+"DESCRIPTION\n"+"Heat the ghee and fry the vermicelli till light brown.\n" +
            "In the meanwhile, boil the water. Add the vermicelli to the boiling water and cover it. Keep stirring occasionally. Once the vermicelli becomes soft , add the sugar and continue to stir. Put the saffron in the milk and dissolve it, add this milk to the vermicelli. Powder the cardamom and add it to the mixture. Then fry the cashew nuts and almonds in ghee and add these. Mix well and boil for about two minutes. Your payasam is ready and can be served hot or cold."
   ,"2 pounds chicken, cut into pieces\n"+"1 teaspoon salt 1 lemon, juiced\n"+"1 1/4 cups plain yogurt\n"+"1/2 onion, finely chopped\n"+"1 clove garlic, minced\n"+"1 teaspoon grated fresh ginger root\n"+"2 teaspoons garam masala\n"+"1 teaspoon cayenne pepper\n"+"1 teaspoon yellow food coloring\n"+"1 teaspoon red food coloring\n"+"2 teaspoons finely chopped cilantro\n"+"1 lemon, cut into wedges "+"DESCRIPTION\n"+
            "Remove skin from chicken pieces, and cut slits into them lengthwise. Place in a shallow dish. Sprinkle both sides of chicken with salt and lemon juice. Set aside 20 minutes\n"+
            "In a medium bowl, combine yogurt, onion, garlic, ginger, garam masala, and cayenne pepper.Mix until smooth. Stir in yellow and red food coloring. Spread yogurt mixture over chicken. Cover, and refrigerate for 6 to 24 hours (the longer the better)\n"+
    "Preheat an outdoor grill for medium high heat, and lightly oil grate\n"+
    "Cook chicken on grill until no longer pink and juices run clear. Garnish with cilantro and lemon wedges\n",
"¼ cup ghee / clarified butter\n"+
" ¾ cup milk\n"+
"2½ cup milk powder\n"+
"½ cup sugar\n"+
"¼ tsp cardamom powder / elachi powder\n"+
"2 tbsp almonds chopped\n"+
"2 tbsp pistachios chopped\n"+
            "DESCRIPTION\n"+
    "firstly, in a large kadai add in ¼ cup ghee and ¾ cup milk\n"+
    "keeping the flame on low add in 2½ cup milk powder\n"+
    "also add ½ cup sugar. add more sugar if required\n"+
    "mix well making sure everything is combined well\n"+
    "stir continuously keeping the flame on low and no lumps formed\n"+
    "also stir till the sugar dissolves\n"+
    "now keep stirring keeping the flame on low till milk thickens\n"+
        "furthermore, the milk forms dough after stirring for 10 minutes\n"+
    "now the dough separates from the pan\n"+
"do not over cook, as the burfi turns chewy\n"+
    "add in ¼ tsp cardamom powder and combine well\n"+
    "transfer the prepared dough into greased plate lined with baking paper\n"+
    "set well forming a block"+


    "now top with few chopped almonds and pistachios and press slightly\n"+
    "allow to set for 2 hours, or till it sets completely\n"+
   "now unmould and cut into pieces\n"+
            "finally, serve milk powder burfi or store in airtight container",
            "1 kilo (2 1/2 lb) organic carrots\n" +
            "50g (2 oz) sultanas\n" +
            "115g (4 oz) assorted nuts (cashews & pistachios) chopped\n" +
            "5-6 green cardamoms, peeled\n" +
            "5-6 cloves\n" +
            "1/4 tsp nutmeg powder\n" +
            "5 tbsp ghee (clarified butter)\n" +
            "500ml (17 fl oz) milk\n" +
            "6 tablespoons extra thick double cream\n" +
            "200ml (7 fl oz) sweetened condensed milk\n" +
            "250g (9 oz) caster sugar, or to taste","1 kilo (2 1/2 lb) organic carrots\n" +
            "50g (2 oz) sultanas\n" +
            "115g (4 oz) assorted nuts (cashews & pistachios) chopped\n" +
            "5-6 green cardamoms, peeled\n" +
            "5-6 cloves\n" +
            "1/4 tsp nutmeg powder\n" +
            "5 tbsp ghee (clarified butter)\n" +
            "500ml (17 fl oz) milk\n" +
            "6 tablespoons extra thick double cream\n" +
            "200ml (7 fl oz) sweetened condensed milk\n" +
            "250g (9 oz) caster sugar, or to taste\n"+"DESRIPTION\n"+"Wash, peel and grate the carrots.\n" +
            "Rinse and dry the raisins. Chop the nuts finely and reserve some for garnishing. Grind the cardamoms and cloves into a fine powder using a mortar and pestle.\n" +
            "Heat the ghee in a heavy non-stick pan until it melts.\n" +
            "Add the cardamom, clove and nutmeg powders to the ghee until it begins to give off aroma of the roasting spices.\n" +
            "Add the chopped nuts; cook until you get the aroma of the roasting nuts.\n" +
            "Add the grated carrots to the pan. Keep sauteing the grated carrot till the water begins to evaporate and the volume of carrots in the pan appears to be lesser.\n" +
            "Add milk. Let the carrots cook in the milk till almost dry. Keep stirring and cook over a low heat to avoid burning.\n" +
            "Add the cream and sweetened condensed milk; continue stirring until the mixture becomes slightly dry again.\n" +
            "When the condensed milk and cream are absorbed, and the carrots are thoroughly cooked, only then add the sugar (according to the sweetness you prefer.)\n" +
            "Continue cooking until the liquid dries up and the halwa leaves the sides of the pan.\n" +
            "Garnish with the remaining nuts and serve warm or chilled with a scoop of vanilla ice cream"};


    public CustomAdapter (Context ctx){
        this.c=ctx;
    }
    @Override
    public int getCount() {
        return Recepie_Name.length;
    }

    @Override
    public Object getItem(int Position) {
        return Recepie_Name[Position] ;
    }

    @Override
    public long getItemId(int Positiion) {
        return Positiion;
    }

    @Override
    public View getView(int Position, View convertview, ViewGroup viewGroup) {
        if (convertview==null)
        {
            LayoutInflater inflater= (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertview=inflater.inflate(R.layout.activity_recepie,null);
        }
        TextView nametext=(TextView)convertview.findViewById(R.id.Recepie_Name);
        ImageView img=(ImageView) convertview.findViewById(R.id.imageView1);
        nametext.setText(Recepie_Name[Position]);
        img.setImageResource(image[Position]);
        return convertview;

    }
}
