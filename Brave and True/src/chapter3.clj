(ns chapter3)

;1. Use the str, vector, list, hash-map, and hash-set functions.
;
(defn -main [& args]
  (println "Hello world")
  (println   (+ 1 2))
  )


;2. Write a function that takes a number and adds 100 to it.
;
;3. Write a function, dec-maker, that works exactly like the function inc-maker except with subtraction:
;(def dec9 (dec-maker 9))
;(dec9 10)
;; => 1
;4. Write a function, mapset, that works like map except the return value is a set:
;
;(mapset inc [1 1 2 2])
;; => #{2 3}
;5. Create a function that’s similar to symmetrize-body-parts except that it has to work with weird space aliens with radial symmetry. Instead of two eyes, arms, legs, and so on, they have five.
;
;6. Create a function that generalizes symmetrize-body-parts and the function you created in Exercise 5. The new function should take a collection of body parts and the number of matching body parts to add. If you’re completely new to Lisp languages and functional programming, it probably won’t be obvious how to do this. If you get stuck, just move on to the next chapter and revisit the problem later.