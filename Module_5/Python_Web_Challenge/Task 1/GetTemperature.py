import time

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager

driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()))
driver.get('https://weather.com/')

current_temperature = driver.find_element(By.XPATH, '//*[@id="WxuCurrentConditions-main-b3094163-ef75-4558-8d9a-e35e6b9b1034"]/div/section/div/div/div[2]/div[1]/div[1]/span')
print('current_temperature', current_temperature.text)
time.sleep(2)

wholeday_temperature = driver.find_element(By.CLASS_NAME,'TodayWeatherCard--TableWrapper--globn')
print(wholeday_temperature,wholeday_temperature.text)







