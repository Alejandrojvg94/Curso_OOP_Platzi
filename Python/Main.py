from Car import Car
from Account import Account
if __name__ == "__main__":
    car = Car()
    car.license = "AMS234"
    car.driver = "Andres Gonzales"
    print(vars(car))

    car2 = Car()
    car2.license = "ZUK78D"
    car2.driver = "Jeremias Sprinfil"

    print(vars(car2))

    account = Account()
    account.document = 106176788
    account.name = "Alejandro Butifarra"
    print(vars(account))
