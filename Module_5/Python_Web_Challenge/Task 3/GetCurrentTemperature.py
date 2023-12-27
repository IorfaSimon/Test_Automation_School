#. Navigate any browser to https://weather.com/ get thecurrent  temperature
#and  print  it  out  in  the  terminal.  Then print out the temperature for
#Morning, Afternoon, Evening,and Overnight.

from selenium import webdriver
from selenium.webdriver.firefox.service import Service
from selenium.webdriver.common.by import By
from webdriver_manager.firefox import GeckoDriverManager

def main():
    driver = webdriver.Firefox(service=Service(GeckoDriverManager().install()))
    driver.get("https://weather.com/")
    current_weather = driver.find_element(By.CLASS_NAME, "CurrentConditions--primary--2DOqs")
    print(" Current weather is ", current_weather.text)
    today_weather = driver.find_element(By.CLASS_NAME, "TodayWeatherCard--TableWrapper--globn")
    temp = today_weather.find_element(By.TAG_NAME, "ul")
    print("Temperature:", temp.text)
    driver.close()


if __name__ == '__main__':
    main()
