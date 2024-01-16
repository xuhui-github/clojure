(def users
  [{:username
    "kyle"
    :firstname
    "Kyle"
    :lastname
    "Smith"
    :balance
    175.00M
    ; Use BigDecimals for money!
    :member-since "2009-04-16"}
   {:username
    "zak"
    :firstname
    "Zackary"
    :lastname
    "Jones"
    :balance
    12.95M
    :member-since "2009-02-01"}
   {:username
    "rob"
    :firstname
    "Robert"
    :lastname
    "Jones"
    :balance
    98.50M
    :member-since "2009-03-30"}])
(def total-cost
  (fn [item-cost number-of-items]
    (* item-cost number-of-items)))

(map (fn [user] (user :member-since)) users)
(map #(:member-since %) users)

(#(vector %&) 1 2 3 4 5)
(#(vector % %&) 1 2 3 4 5)
(#(vector %1 %2 %&) 1 2 3 4 5)
(#(vector %1 %2 %&) 1 2)


(map #(% :member-since) users)
(map :member-since users)
(class users)
(def person (nth users 0))
(:login person)

(def expense {'name "Snow Leopard" 'cost 29.95M})
(expense 'name)
('name expense)
('vendor expense)
('vendor expense :absent)
(:login person :not-found)


(def names (map :firstname users))
(map :firstname users)

(def names ["kyle" "zak" "rob"])
(.getName (class names))

(def name1 [])
(map #(conj  name1  %) (map :firstname users))
(print name1)
(name1)

(def MAX-CONNECTIONS 10)
(def RABBITMQ-CONNECTION)
(def ^:dynamic RABBITMQ-CONNECTION)
(binding [RABBITMQ-CONNECTION (new-connection)]
  ())

(def ^:dynamic *db-host* "localhost")
(defn expense-report [start-data end-date]
  (println *db-host*))
(binding [*db-host* "production"]
  (expense-report "2010-01-01" "2010-01-07"))

