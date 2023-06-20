import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_katalon-testops-online-licence-activation-does-not-work'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/katalon-testops-online-licence-activation-does-not-work/36914')

'step 2: Add visual checkpoint at Page_t_katalon-testops-online-licence-activation-does-not-work'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01018_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
