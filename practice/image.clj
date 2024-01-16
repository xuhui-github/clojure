(ns ch1.image
    (:require [clojure.java.io :as io])
    (:require [javax.imageio ImageIO]
              [java.awt.image BufferedImage]
     )
    
    )

(defrecord PlanetImage [src ^BufferedImage contents])

(defn make-planet-image
  "Make a planetImage; may throw IOException"
  (with-open [img (ImageIO/read (io/input-stream src))]
    (->PlanetImage src img)
    )
  )

