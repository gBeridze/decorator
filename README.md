მოცემული პროგრამა, რომელიც აკეთებს ძალიან დიდ და მნიშვნელოვან საქმეს.

რაღაც დროის შემდეგ გაირკვა, რომ პროგრამა არც თუ ისე ჩქარია და ამიტომ გვჭირდება შევაფასოთ რა დროს უნდება `MainManagerImpl.doGreatJob()` ფუნქციის შესრულებას.

`MainController` და `MainManagerImp`, ასევე `MainManager` ინტერფეისის კოდის შეცვლა არ შიძლება, რადგან არის ძველი კოდი, თავის საქმეს აკეთებს და არ გვინდა რამე გავაფუჭოთ.

ამოცანა უნდა გადაწყდეს დეკორატორ პატერნის გამოყენებით.