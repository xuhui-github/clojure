(defrecord Recipe 
  [name
   description
   ingredients
   steps
   servings
   ]
  )

(defrecord Ingredient 
  [name
   quantity
   unit 
   ]
  )

(def spaghetti-tacos
  (map->Recipe
    {:name "Spaghetti tacos"
     :description "It's spaghetti... in a taco"
     :ingredients [(->Ingredient "Spaghetti" 1 :lb)
                   (->Ingredient "Spaghetti sauce" 16 :oz)
                   (->Ingredient "Taco shell" 12 :shell)
                   ]
     :steps ["Cook spaghetti according to box."
             "Heal spaghetti sauce until warm."
             "Mix spaghetti and sauce."
             "Put spaghetti in taco shell and serve."
             ]
     :servings 4
     }
    )
  )
(ns ch1.validate
    :require [schema.core :as t]
    )


