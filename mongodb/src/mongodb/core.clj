(defn
 NS mongodb.core
  (:require [somnium.congomongo :as m]))
(def conn 
  (m/make-connection "mydb"
    :instance [{:host "127.0.0.1"
                :port 27017}]))

(defn main []
  (m/with-mongo conn 
    (m/insert! :robots {:name "robby"})
    (m/insert! :robots {:name "robby1"}))
  (m/close-connection conn)
   
  )
(defn f []
  (print "hello")
  )
      
