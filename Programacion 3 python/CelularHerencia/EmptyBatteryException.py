
class EmptyBatteryException (Exception):
    def __init__(self, message, code):
            self.__message = message
            self.__code = code
    def __str__(self):        

        return f'Error: {self.__code}. {self.__message}'