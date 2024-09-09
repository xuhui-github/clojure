(ns proj1.core
  (:require [clojure.java.jdbc :as sql ]))
 (def mysql-db {
                 :subprotocol "mysql"
                 :subname "//127.0.0.1:3306/information_schema?useSSL=false"
                 :user "xuhui"
                 :password "flower"
                 })

(defn -main []
  
  (println  (sql/query mysql-db
                      ["select * from employees.employees limit 10"]
                      :println :TABLE_NAME))
  (println (sql/query mysql-db 
                      ["select count(*) as count from employees.employees"]
                      :println :count))
  )
                    


