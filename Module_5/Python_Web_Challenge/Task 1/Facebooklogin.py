from selenium import webdriver
from time import sleep
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get('https://www.facebook.com/')
print ("Opened facebook")
sleep(2)

username_box = driver.find_element(By.ID, 'email')
username_box.send_keys('nderdoo_2012@yahoo.com')
print("nderdoo_2012@yahoo.com")
sleep(2)

password_box = driver.find_element(By.ID, 'pass')
password_box.send_keys('titus@timothy')
print("titus@timothy")

login_button = driver.find_element(By.NAME, 'login')
login_button.click()
sleep(5)

print ("Done")
