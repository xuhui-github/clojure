(def ^:dynmaic my-name 'Mark')
(prn my-name) ;;'Mark'

(binding [my-name "Bob"]
         (prn my-name)
         )
(prn my-name)
