import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_this-session-has-been-terminated-due-to'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/this-session-has-been-terminated-due-to/35973')

'step 2: Add visual checkpoint at Page_t_this-session-has-been-terminated-due-to'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00145_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
