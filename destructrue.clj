(def austen {:name "Jane Austen"
:parents {:father "George" :mother "Cassandra"}
:dates {:born 1775 :died 1817}})

(let [{{dad :father mom :mother } :parents
       {BORN :born DIED :died} :dates
       } austen]
  (println "Jane Austen's dad's name was " dad)
  (println "jane Austen's mom's name was " mom)
  (println "jane borns on " BORN)
  (println "jan died on " DIED)
  )

(let [{name :name
       {mom :mother} :parents
       {dob :born} :dates 
       } austen]
  (println name "was born in " dob)
  (println name "mother's name was" mom)
  )


(def author {:name "Jane Austen"
             :books [{:title "Sense and Sensibility" :published 1811}
                     {:title "Emma" :published 1815}
                     ]
             })

(let [{name :name [_ book] :books} author]
  (println "The author is " name)
  (println "One of the author's book is" book)
  )

(let [{BOOKS :books} author]
  (println (first BOOKS))
  (println (second BOOKS))
  )

(def authors [{:name "Jane Austen" :born 1775}
              {:name "Charles Dickens" :born 1812}
              ])
(let [[{dob-1 :born} {dob-2 :born}] authors]
  (println "One author was born in" dob-1)
  (println "The other author was born in" dob-2)
   )
(let [[author1 author2] authors]
  (println author1)
  (println author2)
  )

(defn character-desc [{name :name age :age gender :gender}]
  (str "Name: " name "age: " age "gender: " gender)
  )

;;:keys says that you are going with the convention of useing the
;;keyword names as your local names.
(defn character-desc1 [{:keys [name age gender]}]
  (str "Name:" name " age:" age " gener:" gender)
  )

(defn character-desc2 [{:keys [name gender] age-in-years :age}]
  (str "Name: " name " age: " age-in-years " gender: " gender )
  )

(def p {:name "Romeo" :age 16 :gender :male})
(character-desc p)
(character-desc2 p)
(character-desc1 p)

(defn add-greeting [{:keys [name age] :as character}]
  (assoc character
         :add-greeting
         (str "Hello, my name is " name " and I am " age ".")
         )
;;  (println character)
  )
(add-greeting p)
(def p1 (add-greeting p))
(println "------------")
(print p1)

(defn add-greeting [character]
  (let [{:keys [name age]} character]
    (assoc character
           :greeting 
           (str "Hello, my name is " name " and I am " age ".")
           )
    )
  )
(println "**********")
(add-greeting p)
(println p)

(defn add-greeting1 [{:keys [name age] :as character}]
  (assoc character
         :greeting
         (str "Hello,my name is " name "and I am " age ".")
         )
  )
(def v1 (add-greeting1 p))
(println v1)


(def authors1 [{:name "Charlie" :fav-book {:title "Carrie" :author ["Stephen" "King"]}}
               
               ])

(defn format-a-name [[_ {{[fname lname] :author} :fav-book}]]
  (str fname " " lname)
  )
(defn format-a-name1 [[_ second-reader]]
  (let [author (-> second-reader :fav-book :author)]
    (str (first author) " " (second author))
    )
  )

(def author {:name "Jane Austen" :born 1975})
;;(def author-name [{n  :name} author])
(def author-name
  (let [{n :name} author] n)
  )
(def author-name (author-name author))
(print author-name)
