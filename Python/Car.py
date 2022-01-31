from pyparsing import lineEnd
from Account import Account


class Car:
    id = int
    license = str
    driver = Account("", "")
    passegenger = str

    def __init__(self, license, driver):
        self.license = license
        self.driver = driver
