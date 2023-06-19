import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_download-files-from-web-ui-not-21'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/download-files-from-web-ui-not-working/8845/21')

'step 2: Add visual checkpoint at Page_t_download-files-from-web-ui-not-21'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00279_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
