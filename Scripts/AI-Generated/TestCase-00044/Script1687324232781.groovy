import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_contact-us'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/contact-us')

'step 2: Add visual checkpoint at Page_contact-us'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00044_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
