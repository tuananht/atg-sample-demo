import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_webdriverexception-unknown-error-failed-to-create-a-chrome-process'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/webdriverexception-unknown-error-failed-to-create-a-chrome-process/14232')

'step 2: Add visual checkpoint at Page_t_webdriverexception-unknown-error-failed-to-create-a-chrome-process'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00983_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
