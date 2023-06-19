import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_document-for-webui-findwebelements-testobject-is-7'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/document-for-webui-findwebelements-testobject-is-missing/54453/7')

'step 2: Add visual checkpoint at Page_t_document-for-webui-findwebelements-testobject-is-7'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00289_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
