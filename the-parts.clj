(ns joy.udp
  (:refer-clojure :exclude [get cat]))

(defn beget [ o p ] (assoc o ::prototype p))

(beget {:sub 0} {:super 1})

;;Put function takes a key and an associated value and puts then into the supplied
;;map,overwriting any existing key of the same name:
(def put assoc)


;;GET
;;Whenever a value isn't found in a given map,the prototype chain is followed until the end:

(defn get [m k]
  (when m
    (if-let [[_ v] (find m k)]
      v
      (recur (::prototype m) k))))

(get (beget {:sub 0 } {:super 1}) :super)

;;Usage

(def cat {:likes-dogs true :ocd-bathing true})
(def morris (beget {:likes-9lives true} cat))
(def post-traumatic-morris (beget {:likes-dogs nil} morris))

(get cat :likes-dogs)

(get morris :likes-dogs)

(get post-traumatic-morris :likes-dogs)


;;Multimethods to the rescue

(defmulti compiler :os)
(defmulti compiler ::unix [m] (get m :c-compiler))
(defmulti compiler ::osx [m] (get m :c-compiler))

(def clone (partial beget {}))
(def unix {:os ::unix, :c-compiler "cc", :home "/home", :dev "/dev"})
(def osx (-> (clone unix)
             (put :os ::osx)
             (put :c-compiler "gcc")
             (put :home "/Users")))

(compiler unix)
