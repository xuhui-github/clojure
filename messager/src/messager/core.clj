(ns messager.core
    (:require [clojure.java.jdbc :as jdbc])
    )
(def db "jdbc:hsqldb:mem:testdb")

(jdbc/execute! db 
               "create table person (id bigint, name varchar(1024))"
               )
(jdbc/execute! db
               "create table policy (id bigint, name varchar(1024))"
               )
(jdbc/execute! db
               "create table person_policy
                (person_id bigint, policy_id bigint)"
               )
(jdbc/insert-multi! db :person
                    [{:id 1 :name "Sally"}
                     {:id 2 :name "Billy"}
                     ]
                    )

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
