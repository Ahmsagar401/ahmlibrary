def call(){
    sh '''
      rm -rf bus_booking
      git clone https://github.com/Ahmsagar401/bus_booking.git
    '''
}
