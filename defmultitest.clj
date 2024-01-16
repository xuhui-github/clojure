(def example-user {:login "rob" :referrer "mint.com" :salary 100000})


(defn fee-amount [percentage user]
  (with-precision 16 :rounding HALF_EVEN
    (* 0.01M percentage (:salary user))))

(defn affiliate-fee [user]
  (case (:referrer user)
    "google.com" (fee-amount 0.01M user)
    "mint.com" (fee-amount 0.03 user)
    (fee-amount 0.02M user)))
(affiliate-fee example-user)
(defmulti affiliate-fee (fn [user] (:referrer user)))


(defmethod affiliate-fee "mint.com" [user] 
  (fee-amount 0.03M user))

(defmethod affiliate-fee "google.com" [user]
  (fee-amount 0.01M user))
(defmethod affiliate-fee :default [user]
  (fee-amount 0.02M user))
(affiliate-fee example-user)
(defmulti affiliate-fee :referrer :default "*")
