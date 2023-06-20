import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_headless-chrome-throwing-exception-org-openqa-selenium-webdriverexception'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/headless-chrome-throwing-exception-org-openqa-selenium-webdriverexception/11557')

'step 2: Add visual checkpoint at Page_t_headless-chrome-throwing-exception-org-openqa-selenium-webdriverexception'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00627_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
