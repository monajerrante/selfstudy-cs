"""
    Vamos a crear una función de utilidada para obtener
    los datos del horóscopo para un día en particular.
"""
import requests

# En el código de Python anterior, creamos una función
# que acepta dos argumentos de cadena (signo y día)
# y devuelve datos JSON. Enviamos una solicitud GET
# en la URL de la API y pasamos el signo y el día
# como parámetros de consulta.
def get_daily_horoscope(sign: str, day: str) -> dict:
    """Obtén el horóscopo diario de un signo zodiacal.
     Argumentos de palabras clave:
     sign:str - Signo zodiacal
     day:str - Fecha en formato (AAAA-MM-DD) O HOY O MAÑANA O AYER
               Date in format (YYYY-MM-DD) OR TODAY OR TOMORROW OR YESTERDAY
     Retorno:dict - datos JSONGet daily horoscope for a zodiac sign.
    """
    url = "https://horoscope-app-api.vercel.app/api/v1/get-horoscope/daily"
    params = {"sign": sign, "day": day}
    response = requests.get(url, params)

    return response.json()

if __name__ == "__main__":
    zodiac = { "Aries" : "Mar 21 - Apr 19",
               "Taurus" : "Apr 20 - May 20",
               "Gemini" : "May 21 - Jun 20",
               "Cancer" : "Jun 21 - Jul 22",
               "Leo" : "Jul 23 - Aug 22",
               "Virgo" : "Aug 23 - Sep 22",
               "Libra" : "Sep 23 - Oct 22",
               "Scorpio" : "Oct 23 - Nov 21",
               "Sagittarius" : "Nov 22 - Dec 21",
               "Capricorn" : "Dec 22 - Jan 19",
               "Aquarius" : "Jan 20 - Feb 18",
               "Pisces" : "Feb 19 - Mar 20",}

    print(get_daily_horoscope("Pisces", "2023-05-19"))
