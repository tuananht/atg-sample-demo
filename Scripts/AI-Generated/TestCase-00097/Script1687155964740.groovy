import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_version-6-3-0-19'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/version-6-3-0-beta/28827/19')

'step 2: Add visual checkpoint at Page_t_version-6-3-0-19'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00097_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
