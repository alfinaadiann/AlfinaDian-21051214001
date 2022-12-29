from interface.driver_operation import DriverOperation

class DriverController(DriverOperation):
    
    def menolak_pesanan(self) -> None:
        print("Driver menolak pesanan karena lokasi tidak terjangkau")
        
    def mengantarkan_pesanan(self) -> None:
        print("Driver mengantarkan pesanan dari penjual ke pembeli")


