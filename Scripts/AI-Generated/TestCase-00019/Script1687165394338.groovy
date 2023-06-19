import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_the-way-to-solve-the-appium-problem-original-error-no-chromedriver-found-that-can-automate-chrome'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/the-way-to-solve-the-appium-problem-original-error-no-chromedriver-found-that-can-automate-chrome/59766')

'step 2: Add visual checkpoint at Page_t_the-way-to-solve-the-appium-problem-original-error-no-chromedriver-found-that-can-automate-chrome'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00019_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
