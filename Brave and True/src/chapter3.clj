(ns chapter3)

;1. Use the str, vector, list, hash-map, and hash-set functions.
; done in REPL
(defn -main [& args]
  (println "Hello world")
  (println   (+ 1 2)))



;2. Write a function that takes a number and adds 100 to it.
;
(defn add100  [x]
  (+ 100 x))
;3. Write a function, dec-maker, that works exactly like the function inc-maker except with subtraction:
;(def dec9 (dec-maker 9))
;(dec9 10)
;; => 1

(defn dec-maker-verbose
  "Create a custom decrementor with beginner friendly syntax"
  [dec-by]
  ; doesn't work
  (fn [x] (- dec-by [x])))

(defn dec-maker-concise
  "Create a custom decrementor using fancy syntax"
  [dec-by]
  ;works
  #(- % dec-by
  )
  ;; in repl
;  (def dec10 (dec-maker-concise 10))
;=> #'user/dec10
;(dec10 12)
;=> 2



;(defn inc-maker
;  "Create a custom incrementor"
;  [inc-by]
;  #(+ % inc-by))
;
;
;(def inc3(inc-maker 3))
;
;
;(inc3 7)
;;=>10

;4. Write a function, mapset, that works like map except the return value is a set:
;
;(mapset inc [1 1 2 2])
;; => #{2 3}
  ;; doesn't work
  (defn mapset [& args]
    (into #{} (map args args)))

  ;; works
  (defn mapset2 [f l]
    (into #{} (map f l)))

;5. Create a function that’s similar to symmetrize-body-parts except that it has to work with weird space aliens with radial symmetry. Instead of two eyes, arms, legs, and so on, they have five.
;
;6. Create a function that generalizes symmetrize-body-parts and the function you created in Exercise 5. The new function should take a collection of body parts and the number of matching body parts to add. If you’re completely new to Lisp languages and functional programming, it probably won’t be obvious how to do this. If you get stuck, just move on to the next chapter and revisit the problem later.