(defn euclidean-nor [ecc-vector] )

(defrecord Planet
  [name moon volume mass aphelion perihelion orbital-eccentricity]
  )

(defn make-planet
  "Make a planet from field values ans an ecc-vector"
  [name moons volume mass aphelion perhelion ecc-vector]
  (->Planet 
    name moons volume mass aphelion perhelion
    (euclidean-nor ecc-vector)
    )
  )

