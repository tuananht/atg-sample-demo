import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_user_license_create_engine'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/user/license/create/engine')

'step 2: Add visual checkpoint at Page_user_license_create_engine'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00095_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
