import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_big-sur-cannot-see-log-viewer-tree-view'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/big-sur-cannot-see-log-viewer-tree-view/50130')

'step 2: Add visual checkpoint at Page_t_big-sur-cannot-see-log-viewer-tree-view'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01019_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
