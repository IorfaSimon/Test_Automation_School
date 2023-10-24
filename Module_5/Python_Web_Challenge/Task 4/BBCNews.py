from selenium import webdriver
from time import sleep

from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
from webdriver_manager.chrome import ChromeDriverManager

driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()))
driver.get('https://www.bbc.com/')
print("Opened bbc")
sleep(2)
news_links = driver.find_elements(By.CLASS_NAME,'block-link__overlay-link')
for links in news_links:
    print('news_links', news_links.text)







