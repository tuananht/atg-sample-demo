import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_publish-html-reports-in-ado'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/publish-html-reports-in-ado/80512')

'step 2: Add visual checkpoint at Page_t_publish-html-reports-in-ado'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00644_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
