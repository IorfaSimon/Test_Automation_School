import time

#Using any browser navigate to any Youtube video of yourchoice,
#allow your script to wait for the comments to load thenget the first
#two comments, and print them in the terminal.***/

from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.firefox.service import Service
from selenium.webdriver.common.by import By
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

def main():
    driver = webdriver.Firefox(service=Service(GeckoDriverManager().install()))
    driver.get("https://www.youtube.com/watch?v=gdZLi9oWNZg")
    driver.execute_script("window.scrollBy(0,1200)", "")
    find_ele = WebDriverWait(driver, 20)
    find_ele.until(EC.visibility_of_any_elements_located((By.ID, "contents")))
    # element = driver.find_element(By.ID, "contents")
    time.sleep(5)
    first_comment = driver.find_element(By.CSS_SELECTOR, "div.style-scope.ytd-app:nth-child(7) ytd-page-manager.style-scope.ytd-app:nth-child(4) ytd-watch-flexy.style-scope.ytd-page-manager.hide-skeleton div.style-scope.ytd-watch-flexy:nth-child(8) div.style-scope.ytd-watch-flexy:nth-child(1) div.style-scope.ytd-watch-flexy div.style-scope.ytd-watch-flexy:nth-child(2) ytd-comments.style-scope.ytd-watch-flexy:nth-child(10) ytd-item-section-renderer.style-scope.ytd-comments:nth-child(2) div.style-scope.ytd-item-section-renderer.style-scope.ytd-item-section-renderer:nth-child(3) ytd-comment-thread-renderer.style-scope.ytd-item-section-renderer:nth-child(1) ytd-comment-renderer.style-scope.ytd-comment-thread-renderer:nth-child(1) div.style-scope.ytd-comment-renderer:nth-child(3) div.style-scope.ytd-comment-renderer:nth-child(2) div.style-scope.ytd-comment-renderer:nth-child(2) ytd-expander.style-scope.ytd-comment-renderer:nth-child(2) div.style-scope.ytd-expander:nth-child(1) yt-formatted-string.style-scope.ytd-comment-renderer:nth-child(2) > span.style-scope.yt-formatted-string:nth-child(1)")
    print(first_comment.text)
    second_comment = driver.find_element(By.XPATH, "//body/ytd-app[1]/div[1]/ytd-page-manager[1]/ytd-watch-flexy[1]/div[5]/div[1]/div[1]/div[2]/ytd-comments[1]/ytd-item-section-renderer[1]/div[3]/ytd-comment-thread-renderer[2]/ytd-comment-renderer[1]/div[3]/div[2]")
    print(second_comment.text)

    driver.close()


if __name__ == '__main__':
    main()