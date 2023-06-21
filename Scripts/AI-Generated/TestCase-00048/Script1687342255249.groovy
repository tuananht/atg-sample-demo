import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_testcase-cannot-load-url-due-to-webdriverexception'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/testcase-cannot-load-url-due-to-webdriverexception/56562')

'step 2: Add visual checkpoint at Page_t_testcase-cannot-load-url-due-to-webdriverexception'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00048_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
