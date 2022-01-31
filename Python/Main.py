from Car import Car
from Account import Account
from Car import Car

if __name__ == "__main__":
    car = Car("AMS234", Account("Andres Gonzales", "10617892"))

    print(vars(car))
    print(vars(car.driver))

    # car2 = Car()
    # car2.license = "ZUK78D"
    # car2.driver = "Jeremias Sprinfil"

    # print(vars(car2))

    # account = Account()
    # account.document = 106176788
    # account.name = "Alejandro Butifarra"
    # print(vars(account))
