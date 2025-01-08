(defn get-waston-1 []
  {:name "John Waston"
   :appears-in "Sign of the Four"
   :author "Doyle"
   }
  )
(defn get-waston-2 [] {:cpu "Power7" :no-cpus 2880 :storage-gb 4000})
(get-waston-1)
(get-waston-2)
(defrecord FictionalCharacter [name appears-in author])

(def waston (->FictionalCharacter "John Waston" "Sign of the Four" "Doyle"))
(println waston)



