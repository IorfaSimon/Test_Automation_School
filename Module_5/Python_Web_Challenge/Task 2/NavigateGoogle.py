from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import service, Service
from webdriver_manager.firefox import GeckoDriverManager
import time

driver = webdriver.Firefox(service=Service(GeckoDriverManager().install()))
driver.get('https://www.google.com/')
time.sleep(2)

search_bar = driver.find_element(By.ID, 'APjFqb')
search_bar.send_keys('python')
time.sleep(10)

search_button = driver.find_element(By.CLASS_NAME, 'gNO89b')
search_button.click()
time.sleep(5)

Wiki_brief = driver.find_element(By.CSS_SELECTOR,'.xGj8Mb > div:nth-child(1)')
print('Wiki_brief', Wiki_brief, Wiki_brief.text)
time.sleep(5)
driver.quit()














