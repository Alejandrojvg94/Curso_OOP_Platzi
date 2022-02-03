from pyparsing import lineEnd
from Account import Account


class Car:
    id = int
    license = str
    driver = Account("", "")
    user = Account("", "")
    passegenger = str

    def __init__(self, license, driver, user):
        self.license = license
        self.driver = driver
        self.user = user
