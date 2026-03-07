
;;In idomatic Clojure using the ns macro,you automatically get two set of symbolic
;;mappings-all classes in the JAVA.LANG package and all the functions,macros spec
;;-ical forms in the CLOJURE.CORE namespace:

(ns chimp)
(reduce + [1 2 3 4 5])


;;Using the in-ns function also import the JAVA.LANG package like ns;but it does't
;;create any mapping for functions or macros in CLOJURE.CORE.the in-ns function
;;also take an explicit symbol used as the namespace qualifier,as in

(in-ns 'gibbon)

;;(reduce + [ 1 2 (Integer. 100)]) Unable to resolve symbol: reduce in this context

(clojure.core/refer 'clojure.core) ;;get all the functions, macros forms in the clojure.core namespace:
(reduce + [1 2 (Integer. 4)])



;;CREATE-NS
;;create-ns function, which when called takes a symbol and returns a namespace object:
;;create-ns does't switch to the named namespace.but it does create java class mappings automatically.
;;When given a namespace object (retrieved using the find-ns function also),you can manipulate its bindings programmatically using the function intern and ns-unmap:



(def b (create-ns 'bonobo))

((ns-map b) 'String) ;; =>java.lang.String

(intern b 'x 9) ;;bound the symbol 'x to the value 9 in the namespace bonobo,
bonobo/x ;;9 referenced it directly using its qualified name bonobo/x

(intern b 'reduce clojure.core/reduce) ;; =>#'bonobo/reduce
(intern b '+      clojure.core/+)
(intern b 'get clojure.core/get)
(intern b 'ns-map clojure.core/ns-map)
(in-ns 'bonobo)
(reduce + [1 2 3 4 5])

(get (ns-map 'bonobo) 'reduce)


(in-ns 'user)
(get (ns-map 'bonobo) 'reduce) ;;=>#'bonobo/reduce

(ns-unmap 'bonobo 'reduce)
(get (ns-map 'bonobo) 'reduce) ;;=>nil


;;Finally,you can wipe a namespace using remove-ns:
(all-ns)
(remove-ns 'bonobo)
(all-ns)


(ns hider.ns)
(defn ^{:private true} answer [] 42)

(ns seeker.ns
  (:refer hider.ns))
;;(answer) Unable to resolve symbol: answer in this context

(ns joy.ns-ex
  (:refer-clojure :exclude [defstruct])
  (:use (clojure set xml))
  (:use [clojure.test :only (are is)])
  (:require (clojure [zip :as z]))
  (:import (java.util Date)
           (java.io File)))











